package com.nativelibs4java.opencl.library;
import com.ochafik.lang.jnaerator.runtime.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cl_image_format extends Structure<cl_image_format, cl_image_format.ByValue, cl_image_format.ByReference > {
	/// C type : cl_channel_order
	public int image_channel_order;
	/// C type : cl_channel_type
	public int image_channel_data_type;
	public cl_image_format() {
		super();
	}
	/**
	 * @param image_channel_order C type : cl_channel_order<br>
	 * @param image_channel_data_type C type : cl_channel_type
	 */
	public cl_image_format(int image_channel_order, int image_channel_data_type) {
		super();
		this.image_channel_order = image_channel_order;
		this.image_channel_data_type = image_channel_data_type;
	}
	
	public java.util.List<String> getFieldOrder() {
		return java.util.Arrays.asList("image_channel_order", "image_channel_data_type");
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected cl_image_format newInstance() { return new cl_image_format(); }
	public static cl_image_format[] newArray(int arrayLength) {
		return Structure.newArray(cl_image_format.class, arrayLength);
	}
	public static class ByReference extends cl_image_format implements Structure.ByReference {
		
	};
	public static class ByValue extends cl_image_format implements Structure.ByValue {
		
	};
}
