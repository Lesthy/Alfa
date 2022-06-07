package alfa;

public class JavaScript extends ProgrammingLanguages {
    private int security = 4;
    private int usage = 2;
    private int syntax = 4;
    private int simplicity = 5;
    private int speed = 4;

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
