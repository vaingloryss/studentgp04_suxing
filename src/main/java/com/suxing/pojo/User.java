package com.suxing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/11/1 0001 下午 3:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String salt;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat
    private Date registTime;
    private Integer claz_id;
}
