package com.netease.vcloud.upload.service.impl;

import java.io.IOException;



import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.GetUploadHostParam;
import com.netease.vcloud.upload.service.GetUploadHostService;
import com.netease.vcloud.upload.util.UploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
* <p>Title: GetUploadHostServiceImpl</p>
* <p>Description: 获取上传加速节点地址的实现类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-21
*/
public class GetUploadHostServiceImpl implements GetUploadHostService {

	/** 日志实例*/
	public static final Logger logger = LoggerFactory.getLogger(GetUploadHostServiceImpl.class);
	
		
	/* 
	* <p>Title: getUploadHost</p>
	* <p>Description: </p>
	* @param bucket
	* @return
	* @throws IOException
	* @throws VcloudException
	* @see com.netease.vcloud.upload.service.GetUploadHostService#getUploadHost(java.lang.String)
	*/
	public GetUploadHostParam getUploadHost(String bucket) throws IOException, VcloudException{
		if(null == bucket || "".equals(bucket.trim()))
			throw new VcloudException("bucket is null or invalid");
		UploadUtil util = new UploadUtil(bucket);
		GetUploadHostParam getUploadHostParam = util.getUploadHost();
		return getUploadHostParam;

	}
}
