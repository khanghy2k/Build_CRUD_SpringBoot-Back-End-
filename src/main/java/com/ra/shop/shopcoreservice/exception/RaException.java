package com.ra.shop.shopcoreservice.exception;

public class RaException extends RuntimeException {
    private ErrorMessage errorMessage;

    public RaException(String errorCode) {
        super(errorCode);
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(errorCode);
        Message mess = new Message();
        mess.setEn("Lỗi hệ thống!");
        mess.setVn("Error internal server!");
        errorMessage.setMessage(mess);
        this.errorMessage = errorMessage;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

}
