package frc.robot.commands.Autos;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShootAuto extends Command{
    Shooter shooter;

    public ShootAuto(Shooter subsystem) {
        shooter = subsystem;
        addRequirements();
    }

    @Override
    public void execute() {
        shooter.startShooter();
        shooter.feedNote();
    }

//    @Override
//    public void execute() {
//    }

    @Override
    public void end(boolean interupted) {
    }
//    @Override
//    public boolean isFinished() {
//        return shooter.isRevved();
//    }
}
