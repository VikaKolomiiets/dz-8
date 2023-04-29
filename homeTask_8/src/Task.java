import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Task {
    private UUID id;
    private String description;
    public Task(String description) throws Exception {
        this.checkName(description);
        this.id = UUID.randomUUID();
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) throws Exception {
        this.checkName(description);
        this.description = description;
    }
    public UUID getId() {
        return id;
    }
    private void checkName(String name) throws Exception {
        if (name == null || name.length() < 2)
            throw new Exception("Description is invalid: null or length less than 2 letters");
    }
}
