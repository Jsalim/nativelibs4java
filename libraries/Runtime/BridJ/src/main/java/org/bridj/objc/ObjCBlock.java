package org.bridj.objc;

import org.bridj.*;

public abstract class ObjCBlock/*<C extends Callback>*/ extends ObjCObject implements CallbackInterface {
	//static final int CALLBACK_CONSTRUCTOR_ID = -2;
	/*protected C callback;
	public ObjCBlock(C callback) {
		super(CALLBACK_CONSTRUCTOR_ID, callback);
		this.callback = callback; // retain a reference
	}
	public ObjCBlock() {
		super();
		assert callback != null; // set by parent constructor
	}
     *
     */
}
