package Exception;

public class StorageException extends RuntimeException {
    private final Integer id;


    public StorageException(String message,Integer id) {
        super(message);
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}
