package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.thymeleaf.messageresolver.IMessageResolver;

@Data
@AllArgsConstructor
public class ErrorResult {
    private String code;
    private String message;
}
