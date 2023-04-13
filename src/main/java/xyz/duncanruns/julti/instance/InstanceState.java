package xyz.duncanruns.julti.instance;

public enum InstanceState {
    WAITING,
    INWORLD,
    TITLE,
    GENERATING,
    PREVIEWING;

    public enum InWorldState {
        UNPAUSED,
        PAUSED,
        GAMESCREENOPEN
    }
}
