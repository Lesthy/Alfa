package alfa;

public class C extends ProgrammingLanguages {
    int security = 1;
    int usage = 4;
    int syntax = 2;
    int speed = 5;
    int simplicity = 2;

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
