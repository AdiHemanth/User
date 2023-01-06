package com.ex.userapp.response;

public class Response {
	private int Status;
	private String Message;
	private Object Data;
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "Response [Status=" + Status + ", Message=" + Message + ", Data=" + Data + "]";
	}
	
}
