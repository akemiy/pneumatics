package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class RunPneumatics extends CommandBase {
  private Pneumatics p;
  public RunPneumatics(Pneumatics p) {
    this.p = p;
    addRequirements(p);
  }

  @Override
  public void execute() {
    p.runPneumatics();
  }

  @Override
  public void end(boolean interrupted) {
    p.stop();
  }
}
