package kr.co.codeplus.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ResultData {

    private String resultCode;          /* 결과코드  */

    private String resultMsg;           /* 결과메세지  */

    private LocalDateTime resultDate;  /* 결과일자  */

    private List<?> errors;             /* 결과에러  */

    private Object data;                /* 단일결과  */

    private List<?> list;               /* 결과리스트 */

}
