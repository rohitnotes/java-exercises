package _g_exceptions._i4_my_own_exceptions;

public class FileDoesNotExistException extends Exception{
    public FileDoesNotExistException (String message){
        super(message);
    }
}