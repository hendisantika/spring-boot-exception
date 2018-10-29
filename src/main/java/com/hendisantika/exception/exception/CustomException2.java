package com.hendisantika.exception.exception;

import com.hendisantika.exception.util.messages.error.ErrorCodes;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/08/18
 * Time: 17.25
 * To change this template use File | Settings | File Templates.
 */
public class CustomException2 extends BaseException {

    public CustomException2() {
        super(ErrorCodes.CUSTOM_EXCEPTION_2);
    }
}
