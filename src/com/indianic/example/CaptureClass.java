package com.indianic.example;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.MediaStore.Images;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class CaptureClass extends Activity implements OnClickListener
{
	private final String TAG = "KetanPatel";
	private final int CAPTURE_IMAGE = 1;
	private Button captureBtn = null;
	private ImageView capturedImage = null;
	private String folderPath = null;
	private String fileName = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.capturetest);

		folderPath = Environment.getExternalStorageDirectory().getAbsoluteFile() + "/CapturedImages/";
		fileName = "ketan.jpg";
		makeDirectory();
		
		captureBtn = (Button)findViewById(R.id.captureBtn);
		captureBtn.setOnClickListener(this);
		capturedImage = (ImageView)findViewById(R.id.capturedImage);
	}

	@Override
	public void onClick(View view)
	{
		if(view.getId() == captureBtn.getId()) 
		{
			//With file uri
//			Log.d(TAG, "PathFile: " + folderPath + fileName);
//			final File imageFile = new File(folderPath + fileName);
//			Log.d(TAG, "FileAlreadyExists: " + imageFile.exists());
//			if(imageFile.exists()) {
//				imageFile.delete();
//			}
//			Log.d(TAG, "AfterDeletion: " + imageFile.exists());
//			final Intent fileUriIntent = new Intent(
//					android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
//			fileUriIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(imageFile));
//			startActivityForResult(fileUriIntent, CAPTURE_IMAGE);
			
			//With content uri
			final Intent contentUriIntent = new Intent(
					android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(contentUriIntent, CAPTURE_IMAGE);
		}
	}
	
	private boolean makeDirectory() 
	{
		final File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		return (folder.isDirectory());
	}
	
	public float rotationForImage(final Uri uri) 
	{
		Log.d(TAG, "WhichUri: " + uri.getScheme().toString());
		
		if(uri.getScheme().equals("content")) {
			String[] projection = { Images.ImageColumns.ORIENTATION };
			final Cursor cursor = getContentResolver().query(uri, projection, null, null,
					null);
			if (cursor.moveToFirst()) {
				return cursor.getInt(0);
			}
		} else if(uri.getScheme().equals("file")) {
			try {
				ExifInterface exif = new ExifInterface(uri.getPath());
				int rotation = (int) exifOrientationToDegrees(exif
						.getAttributeInt(ExifInterface.TAG_ORIENTATION,
								ExifInterface.ORIENTATION_NORMAL));
				return rotation;
			} catch (IOException e) {
				Log.e(TAG, "Error checking exif: " + e.toString());
			}
		}
		
		return 0f;
	}

	private float exifOrientationToDegrees(final int exifOrientation) 
	{
		if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_90) {
			return 90;
		} else if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_180) {
			return 180;
		} else if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_270) {
			return 270;
		}
		return 0;
	}
	
	public String getRealPathFromURI(final Uri contentUri) 
	{
        String[] proj = { MediaStore.Images.Media.DATA };
        Cursor cursor = managedQuery(contentUri, proj, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
		if (resultCode == Activity.RESULT_OK) 
		{
			if (requestCode == CAPTURE_IMAGE) 
			{
				float rotation = 0f;
				final File imageFile = new File(folderPath + fileName);
//				rotation = rotationForImage(Uri.fromFile(imageFile));
				rotation = rotationForImage(data.getData());
				Log.d(TAG, "Rotation: " + rotation);

				final BitmapFactory.Options options = new BitmapFactory.Options();
				options.inPurgeable = true; 
				options.inSampleSize = 4;
				options.inDensity = 1; 
				options.inDither = true;
//				final Bitmap mBitmap = BitmapFactory.decodeFile(folderPath + fileName, options);
				final Bitmap mBitmap = BitmapFactory.decodeFile(getRealPathFromURI(data.getData()), options);
				if (mBitmap != null) {
					final int mWidth = mBitmap.getWidth();
					final int mHeight = mBitmap.getHeight();
					Log.d(TAG, "Bitmap Width Height: " + mWidth + " " + mHeight);
			        Matrix matrix = new Matrix();
			        matrix.postRotate(rotation);
			        final Bitmap resizedBitmap = Bitmap.createBitmap(mBitmap, 0, 0,
			        		mWidth, mHeight, matrix, true);
			        Log.d(TAG, "New Width Height: " + resizedBitmap.getWidth() + " " + resizedBitmap.getHeight());
			        ByteArrayOutputStream baos = new ByteArrayOutputStream();
			        resizedBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
					capturedImage.setImageBitmap(resizedBitmap);
				}
			}
		}
	}
	
}