package HW5.task1.Core.CustomExceptions;

public class BadCsvContentException extends Exception{
    public BadCsvContentException() {
        super("Invalid CSV file specified, cannot load Phonebook");
    }
}