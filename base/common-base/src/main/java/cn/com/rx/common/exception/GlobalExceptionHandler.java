package cn.com.rx.common.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 全局MVC 异常处理器
 * 说明：
 * 这里只做了一个简单的异常处理 只做设置statusCode
 * 没有对json类型做处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static ConcurrentHashMap ExceptionMap = new ConcurrentHashMap();
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //我们也可以通过 自定义
    @ExceptionHandler({Exception.class})
    public Object badRequest(HandlerMethod handlerMethod, HttpServletRequest req, HttpServletResponse rep, Exception exception) {
        log(req,exception);
        int statusCode = getStatus(req,exception);
        //这里没有做 MOdelAndView 视图的专门处理，制作了restApi处理
        return ResponseEntity.status(statusCode);
    }

    private int getStatus(HttpServletRequest req,Exception ex){
        int statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
        ResponseStatus responseStatus =null;
        while (ex instanceof ServletException && ex.getCause()!=null){
            ex=(Exception) ex.getCause();
            responseStatus = AnnotationUtils.findAnnotation(ex.getClass(),ResponseStatus.class);
            if(responseStatus!=null){
                break;
            }
            if(responseStatus!=null){
                return responseStatus.code().value();
            }else if(isDefaultException(ex)){
                //因为这里只声明了一个BizException 才这样，不然会报错。这里有时间应该写个
                //构建器来完成这些
                BizException bizException = (BizException)ex;
                return Integer.parseInt(bizException.getErrorCode());
            }
        }
        return statusCode;
    }
    /**
     * 日志打印
     * @param req
     * @param exc
     */
    private void log(HttpServletRequest req, Exception exc) {
        if(isDefaultException(exc)){
            BizException exception = (BizException)exc;
            logger.error("path={},errorCode={},errorMeg={}",req.getRequestURI(),exception.getErrorCode(),exception.getErrorMsg());
        }else{
            logger.error("path={}", req.getRequestURI());
        }
    }

    /**
     * 判断是否是自定义异常
     * @param ex
     * @return
     */
    public boolean isDefaultException(Exception ex){
        if(ExceptionMap.containsKey(ex.getClass())){
            return true;
        }
        return false;
    }
}
