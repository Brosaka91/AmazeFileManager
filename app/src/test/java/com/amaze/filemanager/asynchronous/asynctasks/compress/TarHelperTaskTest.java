package com.amaze.filemanager.asynchronous.asynctasks.compress;

import android.os.Environment;

import java.io.File;

public class TarHelperTaskTest extends AbstractCompressedHelperTaskTest {

    @Override
    protected CompressedHelperTask createTask(String relativePath) {
        return new TarHelperTask(new File(Environment.getExternalStorageDirectory(),
                "test-archive." + getArchiveType()).getAbsolutePath(),
                relativePath, false, (data) -> {});
    }

    @Override
    protected String getArchiveType() {
        return "tar";
    }
}
