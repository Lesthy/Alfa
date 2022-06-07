package alfa;

public class Python extends ProgrammingLanguages {
    private int security = 5;
    private int usage = 5;
    private int syntax = 5;
    private int speed = 2;

    private int simplicity = 4;

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
