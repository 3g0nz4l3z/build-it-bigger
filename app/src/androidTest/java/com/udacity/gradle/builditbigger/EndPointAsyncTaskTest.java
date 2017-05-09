package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Created by m4ch1n3 on 4/5/2017.
 */
public class EndPointAsyncTaskTest {

        @Test
        public void testEmptyString() throws ExecutionException, InterruptedException {
            Context context  = InstrumentationRegistry.getContext();
            AsyncTask endPointAsyncTask = new EndPointAsyncTask(context).execute();
            assertNotNull(endPointAsyncTask.get());
        }
}