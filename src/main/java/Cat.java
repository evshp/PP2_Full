import org.springframework.context.annotation.Bean;

public class Cat
{
    private String name;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
