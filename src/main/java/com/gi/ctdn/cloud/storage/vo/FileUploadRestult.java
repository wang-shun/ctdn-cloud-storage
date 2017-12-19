package com.gi.ctdn.cloud.storage.vo;

import com.gi.ctdn.cloud.storage.param.FileParam;
import com.gi.ctdn.cloud.storage.pojo.UploadFile;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vincent
 * Date: 17-2-10
 * Time: 下午1:30
 * Package: com.gi.ctdn.cloud.storage.vo
 * Company: 星河互联
 * Group:   创投大脑
 */
@Data
public class FileUploadRestult implements Serializable{

    private Boolean isSuccess =true;

    private String msg = "success";

    private List<UploadFile> uploadFiles;
}