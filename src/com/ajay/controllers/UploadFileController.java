package com.ajay.controllers;



import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFileController {

	private static final Logger logger=LoggerFactory.getLogger(UploadFileController.class);
	
	
	
	@RequestMapping(value="/uploadfile",method=RequestMethod.GET)
	public @ResponseBody
	String uploadFileHandler(@RequestParam("name")String name,@RequestParam("file")MultipartFile file)
	{
		if(!file.isEmpty())
		{
			try
			{
				byte[] bytes=file.getBytes();
				String rootPath = System.getProperty("Catalina.home");
				File dir=new File(rootPath + File.separator + "tmpFiles");
				if(!dir.exists())
					dir.mkdirs();
				
				// server file
				File serverFile=new File(dir.getAbsolutePath()+ File.separator + name);
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				
				logger.info("Server File Location="+ serverFile.getAbsolutePath());
				
				return "You successfully uploaded file=" + name;
				
			}	catch(Exception e)
			{
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		}else {
			return "You failed to upload " + name
					+ " because the file was empty.";
	}
  }
}
