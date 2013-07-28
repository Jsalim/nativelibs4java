package com.nativelibs4java.opencl.library;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("OpenCL") 
public class cl_image_format extends StructObject {
	/** C type : cl_channel_order */
	@Field(0) 
	public int image_channel_order() {
		return this.io.getIntField(this, 0);
	}
	/** C type : cl_channel_order */
	@Field(0) 
	public cl_image_format image_channel_order(int image_channel_order) {
		this.io.setIntField(this, 0, image_channel_order);
		return this;
	}
	/** C type : cl_channel_type */
	@Field(1) 
	public int image_channel_data_type() {
		return this.io.getIntField(this, 1);
	}
	/** C type : cl_channel_type */
	@Field(1) 
	public cl_image_format image_channel_data_type(int image_channel_data_type) {
		this.io.setIntField(this, 1, image_channel_data_type);
		return this;
	}
	public cl_image_format() {
		super();
	}
	public cl_image_format(Pointer pointer) {
		super(pointer);
	}
}
