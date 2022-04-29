// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunMotor extends CommandBase {
  /** Creates a new RunMotor. */
  private MotorSubsystem motorSubsystem;
  private XboxController joystick;
  public RunMotor(MotorSubsystem motorSubsystem, XboxController joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motorSubsystem = motorSubsystem;
    this.joystick = joystick;
    addRequirements(motorSubsystem);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    motorSubsystem.setPower(joystick.getLeftY()*0.4);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    motorSubsystem.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
