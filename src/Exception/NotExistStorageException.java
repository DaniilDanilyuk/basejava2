package Exception;

public class NotExistStorageException extends StorageException {

    public NotExistStorageException(Integer id) {
        super("Resume "+id+ " not exist", id);
    }
}
