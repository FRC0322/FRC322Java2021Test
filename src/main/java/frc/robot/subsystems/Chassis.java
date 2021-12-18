/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {
	/**
	 * The Chassis subsystem incorporates the sensors and actuators attached to the
	 * robots chassis. It includes the four drive motors (two on each side),
	 * quadrature encoders connected directly to each front motor Talon SRX, and a
	 * navX-MXP IMU.
	 */

	private final WPI_TalonSRX m_leftFrontMotor = new WPI_TalonSRX(Constants.DRIVE_LEFTFRONT);
	private final WPI_TalonSRX m_leftRearMotor = new WPI_TalonSRX(Constants.DRIVE_LEFTREAR);
	private final WPI_TalonSRX m_rightFrontMotor = new WPI_TalonSRX(Constants.DRIVE_RIGHTFRONT);
	private final WPI_TalonSRX m_rightRearMotor = new WPI_TalonSRX(Constants.DRIVE_RIGHTREAR);

	private final SpeedController m_leftMotors = new SpeedControllerGroup(m_leftFrontMotor, m_leftRearMotor);
	private final SpeedController m_rightMotors = new SpeedControllerGroup(m_rightFrontMotor, m_rightRearMotor);

	private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

	/**
	 * Creates a new Chassis.
	 */
	public Chassis() {
		super();
		// Invert all four motors due to the way they're mounted.
		m_leftMotors.setInverted(true);
		m_rightMotors.setInverted(true);

		// Change the motors to "coast" mode
		coast(true);

		// Setup the encoders
		//System.out.println("Encoders Setup");

	}

	/**
	 * Modern racing game style driving for the Chassis.
	 *
	 * @param speed    Speed in range [-1.0,1.0]
	 * @param rotation Rotation in range [-1.0,1.0]
	 */
	// public void drive(double speed, double rotation) {
	// m_drive.arcadeDrive(speed, rotation);
	// }

	/**
	 * Classic two stick Tank Drive style driving for the Chassis.
	 *
	 * @param left  Left motor speed in range [-1.0,1.0]
	 * @param right Right motor speed in range [-1.0,1.0]
	 */
	public void drive(double left, double right) {
		m_drive.tankDrive(left, right);
	}

	// This method sets the robot to brake when the throttle is idle.
	public void brake(boolean brake) {
		if (brake) {
			m_leftFrontMotor.setNeutralMode(NeutralMode.Brake);
			m_leftRearMotor.setNeutralMode(NeutralMode.Brake);
			m_rightFrontMotor.setNeutralMode(NeutralMode.Brake);
			m_rightRearMotor.setNeutralMode(NeutralMode.Brake);
		} else {
			m_leftFrontMotor.setNeutralMode(NeutralMode.Coast);
			m_leftRearMotor.setNeutralMode(NeutralMode.Coast);
			m_rightFrontMotor.setNeutralMode(NeutralMode.Coast);
			m_rightRearMotor.setNeutralMode(NeutralMode.Coast);
		}
	}

	// This method sets the robot to coast when the throttle is idle.
	public void coast(boolean coast) {
		if (coast) {
			m_leftFrontMotor.setNeutralMode(NeutralMode.Coast);
			m_leftRearMotor.setNeutralMode(NeutralMode.Coast);
			m_rightFrontMotor.setNeutralMode(NeutralMode.Coast);
			m_rightRearMotor.setNeutralMode(NeutralMode.Coast);

		} else {
			m_leftFrontMotor.setNeutralMode(NeutralMode.Brake);
			m_leftRearMotor.setNeutralMode(NeutralMode.Brake);
			m_rightFrontMotor.setNeutralMode(NeutralMode.Brake);
			m_rightRearMotor.setNeutralMode(NeutralMode.Brake);
		}
	}

	// This stops the robot
	public void stop() {
		m_drive.arcadeDrive(0.0, 0.0);
		brake(true);
	}

	@Override
	// This method will be called once per scheduler run
	public void periodic() {
	}
}
