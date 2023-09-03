package Exception;

public class ExistStorageException extends StorageException{
    public ExistStorageException(Integer id) {
        super("Resume " + id + " already exist", id);
    }
}
