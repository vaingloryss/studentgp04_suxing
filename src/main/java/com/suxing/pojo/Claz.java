package com.suxing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/11/1 0001 下午 3:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claz {
    private Integer id;
    private String clazname;
    @DateTimeFormat
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date create_time;
}
