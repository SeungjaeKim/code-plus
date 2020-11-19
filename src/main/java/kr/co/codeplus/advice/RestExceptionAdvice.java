package kr.co.codeplus.advice;

import kr.co.codeplus.domain.ResultData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

@RestControllerAdvice
public class RestExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected ResultData defaultException(HttpServletRequest request, Exception e){
        ResultData resultData = new ResultData();
        resultData.setResultCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        resultData.setResultMsg(e.getMessage());
        resultData.setResultDate(LocalDateTime.now());
        resultData.setErrors(Arrays.asList(e.getStackTrace()));
        return resultData;
    }

}
