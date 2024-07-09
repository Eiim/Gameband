/*
 * Extracted from the mysterious hidapi-1.1.3.jar that comes with the Gameband
 * Doesn't match publicly known continuations of hidapi, probably custom-built for Gameband
 * hidapi is originally 3-clause BSD licensed
 */
package com.codeminders.hidapi2;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassPathLibraryLoader {
	private static final Logger LOGGER = Logger.getLogger(ClassPathLibraryLoader.class.getName());

	private static final String[] HID_LIB_NAMES = new String[] { "hidapi-jni-64.dll", "hidapi-jni-32.dll",
			"libhidapi-jni-64.jnilib", "libhidapi-jni-32.jnilib", "libhidapi-jni-64.so", "libhidapi-jni-32.so" };

	public static boolean loadNativeHIDLibrary(File libDir) {
		boolean isHIDLibLoaded = false;
		for (String path : HID_LIB_NAMES) {
			try {
				File lib = new File(libDir, path);
				Runtime.getRuntime().load(lib.getAbsolutePath());
				isHIDLibLoaded = true;
				LOGGER.log(Level.INFO, "Successfully loaded native library: " + path);
			} catch (Exception e) {
				LOGGER.log(Level.INFO, "Exception native library: " + path, e);
			} catch (UnsatisfiedLinkError e) {
				LOGGER.log(Level.INFO, e.toString());
			}
			if (isHIDLibLoaded)
				break;
		}
		return isHIDLibLoaded;
	}
}