package alfa;

public class PHP extends alfa.ProgrammingLanguages {
    private int security = 2;
    private int usage = 1;
    private int syntax = 3;
    private int simplicity = 1;
    private int speed = 1;

    @Override
    public int getSecurity() {
        return security;
    }

    @Override
    public int getUsage() {
        return usage;
    }

    @Override
    public int getSyntax() {
        return syntax;
    }

    @Override
    public int getSimplicity() {
        return simplicity;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
