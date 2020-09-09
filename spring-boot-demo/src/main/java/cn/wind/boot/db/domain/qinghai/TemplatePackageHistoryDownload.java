package cn.wind.boot.db.domain.qinghai;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@TableName("template_package_history_download")
@Data
@NoArgsConstructor
public class TemplatePackageHistoryDownload implements Serializable {

    private static final long serialVersionUID = 2823814076460406895L;

    // 主键id
    private Long id;

    // 模板包id
    private Long templatepackageid;

    // 创建时间
    private Date createtime;

    // 压缩包路径
    private String fileurl;

}