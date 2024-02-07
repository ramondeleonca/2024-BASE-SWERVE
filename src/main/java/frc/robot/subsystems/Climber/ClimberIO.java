package frc.robot.subsystems.Climber;

import org.littletonrobotics.junction.AutoLog;

public interface ClimberIO {
    @AutoLog
    class ClimberIOInputs {
        double leftClimberSpeed;
        double rightClimberSpeed;
    }

    void setLeftClimberSpeed(double speed);
    void setRightClimberSpeed(double speed);
    void set(double leftSpeed, double rightSpeed);
    void set(double speed);

    void setLeftClimberUp();
    void setLeftClimberDown();

    void setRightClimberUp();
    void setRightClimberDown();

    void stopLeftClimber();
    void stopRightClimber();
    void stop();

    void updateInouts(ClimberIOInputs inputs);
    public default void periodic() {};
}