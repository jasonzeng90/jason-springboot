package com.rockfintech.reas.xabank.common.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class ComResponse<T> implements Serializable {

	private static final long serialVersionUID = 3139953403088817455L;

	/**
	 * 返回代码
	 */
	@ApiModelProperty(value = "响应码（000000-成功）")
	private  String code = "000000";// 默认失败
	/**
	 * 提示信息
	 */
	@ApiModelProperty(value = "描述")
	private  String msg = "操作成功"; // 默认操作失败
	/**
	 * 返回信息
	 */
	@ApiModelProperty(value = "响应信息")
	private  T data = null;

	public static String CODE_SUCCESS = "000000";
	public static String CODE_AX_SUC = "60000000";
	public static String CODE_EXCEPTION = "999999";//异常
	public static String CODE_ERROR = "999999";//其他错误或者逻辑错误

	public static String CODE_APPID_ERROR = "401";//未知的应用
	public static String CODE_PRI_KEY_ERROR = "402";//解密失败或者私钥错误
	public static String CODE_PUB_KEY_ERROR = "403";//签名错误或者公钥错误


	public ComResponse(String code) {
		this.code = code;
	}

	public ComResponse() {
	}

	public ComResponse(ComResponse serviceResult) {
		this.code = serviceResult.getCode();
		this.msg = serviceResult.getMsg();
	}

	public ComResponse(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public ComResponse(String code, String msg, T ext) {
		this.code = code;
		this.msg = msg;
		this.data = ext;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
