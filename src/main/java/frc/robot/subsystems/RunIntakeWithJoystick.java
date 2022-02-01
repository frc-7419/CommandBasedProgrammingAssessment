// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntakeWithJoystick extends CommandBase {
  private IntakeSubsystem intake;
  private PaddedXbox joystick;
  /** Creates a new RunIntakeWithJoystick. */
  public RunIntakeWithJoystick(IntakeSubsystem intake, PaddedXbox joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake;
    this.joystick = joystick;
    addRequirements(this.intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.setPower(joystick.getLeftY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}