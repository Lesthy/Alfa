package alfa;

public class Java extends alfa.ProgrammingLanguages {
    private int security = 3;
    private int usage = 3;
    private int syntax = 1;
    private int speed = 3;
    private int simplicity = 3;

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
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getSimplicity() {
        return simplicity;
    }
}
