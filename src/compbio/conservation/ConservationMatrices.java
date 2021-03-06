/*
 * Copyright (c) 2010 Agnieszka Golicz & Peter Troshin 
 * 
 * Amino Acid Conservation @version: 1.0 
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the Apache License version 2 as published by the
 * Apache Software Foundation This library is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Apache
 * License for more details. A copy of the license is in apache_license.txt. It
 * is also available here: http://www.apache.org/licenses/LICENSE-2.0.txt 
 * Any republication or derived work distributed in source code form must 
 * include this copyright and license notice.
 * 
 */
package compbio.conservation;

/**
 * 
 * @author Agnieszka Golicz & Peter Troshin
 * 
 */
final class ConservationMatrices {

	/**
	 * Blosum62 matrix, not normalized.
	 */
	static final int[] blosum2 = { 4, -1, -2, -2, 0, -1, -1, 0, -2, -1, -1, -1,
			-1, -2, -1, 1, 0, -3, -2, 0, -2, -1, 0, -4, -1, 5, 0, -2, -3, 1, 0,
			-2, 0, -3, -2, 2, -1, -3, -2, -1, -1, -3, -2, -3, -1, 0, -1, -4,
			-2, 0, 6, 1, -3, 0, 0, 0, 1, -3, -3, 0, -2, -3, -2, 1, 0, -4, -2,
			-3, 3, 0, -1, -4, -2, -2, 1, 6, -3, 0, 2, -1, -1, -3, -4, -1, -3,
			-3, -1, 0, -1, -4, -3, -3, 4, 1, -1, -4, 0, -3, -3, -3, 9, -3, -4,
			-3, -3, -1, -1, -3, -1, -2, -3, -1, -1, -2, -2, -1, -3, -3, -2, -4,
			-1, 1, 0, 0, -3, 5, 2, -2, 0, -3, -2, 1, 0, -3, -1, 0, -1, -2, -1,
			-2, 0, 3, -1, -4, -1, 0, 0, 2, -4, 2, 5, -2, 0, -3, -3, 1, -2, -3,
			-1, 0, -1, -3, -2, -2, 1, 4, -1, -4, 0, -2, 0, -1, -3, -2, -2, 6,
			-2, -4, -4, -2, -3, -3, -2, 0, -2, -2, -3, -3, -1, -2, -1, -4, -2,
			0, 1, -1, -3, 0, 0, -2, 8, -3, -3, -1, -2, -1, -2, -1, -2, -2, 2,
			-3, 0, 0, -1, -4, -1, -3, -3, -3, -1, -3, -3, -4, -3, 4, 2, -3, 1,
			0, -3, -2, -1, -3, -1, 3, -3, -3, -1, -4, -1, -2, -3, -4, -1, -2,
			-3, -4, -3, 2, 4, -2, 2, 0, -3, -2, -1, -2, -1, 1, -4, -3, -1, -4,
			-1, 2, 0, -1, -3, 1, 1, -2, -1, -3, -2, 5, -1, -3, -1, 0, -1, -3,
			-2, -2, 0, 1, -1, -4, -1, -1, -2, -3, -1, 0, -2, -3, -2, 1, 2, -1,
			5, 0, -2, -1, -1, -1, -1, 1, -3, -1, -1, -4, -2, -3, -3, -3, -2,
			-3, -3, -3, -1, 0, 0, -3, 0, 6, -4, -2, -2, 1, 3, -1, -3, -3, -1,
			-4, -1, -2, -2, -1, -3, -1, -1, -2, -2, -3, -3, -1, -2, -4, 7, -1,
			-1, -4, -3, -2, -2, -1, -2, -4, 1, -1, 1, 0, -1, 0, 0, 0, -1, -2,
			-2, 0, -1, -2, -1, 4, 1, -3, -2, -2, 0, 0, 0, -4, 0, -1, 0, -1, -1,
			-1, -1, -2, -2, -1, -1, -1, -1, -2, -1, 1, 5, -2, -2, 0, -1, -1, 0,
			-4, -3, -3, -4, -4, -2, -2, -3, -2, -2, -3, -2, -3, -1, 1, -4, -3,
			-2, 11, 2, -3, -4, -3, -2, -4, -2, -2, -2, -3, -2, -1, -2, -3, 2,
			-1, -1, -2, -1, 3, -3, -2, -2, 2, 7, -1, -3, -2, -1, -4, 0, -3, -3,
			-3, -1, -2, -2, -3, -3, 3, 1, -2, 1, -1, -2, -2, 0, -3, -1, 4, -3,
			-2, -1, -4, -2, -1, 3, 4, -3, 0, 1, -1, 0, -3, -4, 0, -3, -3, -2,
			0, -1, -4, -3, -3, 4, 1, -1, -4, -1, 0, 0, 1, -3, 3, 4, -2, 0, -3,
			-3, 1, -1, -3, -1, 0, -1, -3, -2, -2, 1, 4, -1, -4, 0, -1, -1, -1,
			-2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -2, 0, 0, -2, -1, -1, -1,
			-1, -1, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4,
			-4, -4, -4, -4, -4, -4, -4, -4, -4, 1 };
	/**
	 * Blosum62 matrix, normalized.
	 */
	static final double[] blosum = { 6, -2, -2, -3, -1, -1, -1, 0, -2, -2, -2,
			-1, -1, -3, -1, 2, 0, -4, -3, 0, -2.5, -2.5, -6, -6, -2, 8, -1, -2,
			-5, 1, 0, -3, 0, -4, -3, 3, -2, -4, -3, -1, -2, -4, -3, -4, -1.5,
			-1.5, -6, -6, -2, -1, 8, 2, -4, 0, 0, -1, 1, -5, -5, 0, -3, -4, -3,
			1, 0, -6, -3, -4, 5, 5, -6, -6, -3, -2, 2, 9, -5, 0, 2, -2, -2, -5,
			-5, -1, -5, -5, -2, 0, -2, -6, -5, -5, 5.5, 5.5, -6, -6, -1, -5,
			-4, -5, 13, -4, -5, -4, -4, -2, -2, -5, -2, -4, -4, -1, -1, -3, -4,
			-1, -4.5, -4.5, -6, -6, -1, 1, 0, 0, -4, 8, 3, -3, 1, -4, -3, 2,
			-1, -5, -2, 0, -1, -3, -2, -3, 0, 0, -6, -6, -1, 0, 0, 2, -5, 3, 7,
			-3, 0, -5, -4, 1, -3, -5, -2, 0, -1, -4, -3, -4, 1, 1, -6, -6, 0,
			-3, -1, -2, -4, -3, -3, 8, -3, -6, -5, -2, -4, -5, -3, 0, -2, -4,
			-5, -5, -1.5, -1.5, -6, -6, -2, 0, 1, -2, -4, 1, 0, -3, 11, -5, -4,
			-1, -2, -2, -3, -1, -3, -4, 3, -5, -0.5, -0.5, -6, -6, -2, -4, -5,
			-5, -2, -4, -5, -6, -5, 6, 2, -4, 2, 0, -4, -4, -1, -4, -2, 4, -5,
			-5, -6, -6, -2, -3, -5, -5, -2, -3, -4, -5, -4, 2, 6, -4, 3, 1, -4,
			-4, -2, -2, -2, 1, -5, -5, -6, -6, -1, 3, 0, -1, -5, 2, 1, -2, -1,
			-4, -4, 7, -2, -5, -2, 0, -1, -4, -3, -3, -0.5, -0.5, -6, -6, -1,
			-2, -3, -5, -2, -1, -3, -4, -2, 2, 3, -2, 8, 0, -4, -2, -1, -2, -1,
			1, -4, -4, -6, -6, -3, -4, -4, -5, -4, -5, -5, -5, -2, 0, 1, -5, 0,
			9, -5, -4, -3, 1, 4, -1, -4.5, -4.5, -6, -6, -1, -3, -3, -2, -4,
			-2, -2, -3, -3, -4, -4, -2, -4, -5, 11, -1, -2, -5, -4, -4, -2.5,
			-2.5, -6, -6, 2, -1, 1, 0, -1, 0, 0, 0, -1, -4, -4, 0, -2, -4, -1,
			6, 2, -4, -3, -2, 0.5, 0.5, -6, -6, 0, -2, 0, -2, -1, -1, -1, -2,
			-3, -1, -2, -1, -1, -3, -2, 2, 7, -4, -2, 0, -1, -1, -6, -6, -4,
			-4, -6, -6, -3, -3, -4, -4, -4, -4, -2, -4, -2, 1, -5, -4, -4, 16,
			3, -4, -6, -6, -6, -6, -3, -3, -3, -5, -4, -2, -3, -5, 3, -2, -2,
			-3, -1, 4, -4, -3, -2, 3, 10, -2, -4, -4, -6, -6, 0, -4, -4, -5,
			-1, -3, -4, -5, -5, 4, 1, -3, 1, -1, -4, -2, 0, -4, -2, 6, -4.5,
			-4.5, -6, -6, -2.5, -1.5, 5, 5.5, -4.5, 0, 1, -1.5, -0.5, -5, -5,
			-0.5, -4, -4.5, -2.5, 0.5, -1, -6, -4, -4.5, 8.5, 0.5, -6, -6,
			-2.5, -1.5, 5, 5.5, -4.5, 0, 1, -1.5, -0.5, -5, -5, -0.5, -4, -4.5,
			-2.5, 0.5, -1, -6, -4, -4.5, 0.5, 7.5, -6, -6, -6, -6, -6, -6, -6,
			-6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6,
			-6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6,
			-6, -6, -6, -6, -6, -6, -6, -6, -6 };
	/**
	 * Gonnet matrix, normalized.
	 */
	static final double[] gonnet = { 2.4, -0.6, -0.3, -0.3, 0.5, -0.2, 0.0,
			0.5, -0.8, -0.8, -1.2, -0.4, -0.7, -2.3, 0.3, 1.1, 0.6, -3.6, -2.2,
			0.1, -0.3, -0.3, -5.2, -5.2, -0.6, 4.7, 0.3, -0.3, -2.2, 1.5, 0.4,
			-1.0, 0.6, -2.4, -2.2, 2.7, -1.7, -3.2, -0.9, -0.2, -0.2, -1.6,
			-1.8, -2.0, 0, 0, -5.2, -5.2, -0.3, 0.3, 3.8, 2.2, -1.8, 0.7, 0.9,
			0.4, 1.2, -2.8, -3.0, 0.8, -2.2, -3.1, -0.9, 0.9, 0.5, -3.6, -1.4,
			-2.2, 3, 3, -5.2, -5.2, -0.3, -0.3, 2.2, 4.7, -3.2, 0.9, 2.7, 0.1,
			0.4, -3.8, -4.0, 0.5, -3.0, -4.5, -0.7, 0.5, 0.0, -5.2, -2.8, -2.9,
			3.45, 3.45, -5.2, -5.2, 0.5, -2.2, -1.8, -3.2, 11.5, -2.4, -3.0,
			-2.0, -1.3, -1.1, -1.5, -2.8, -0.9, -0.8, -3.1, 0.1, -0.5, -1.0,
			-0.5, 0.0, -2.5, -2.5, -5.2, -5.2, -0.2, 1.5, 0.7, 0.9, -2.4, 2.7,
			1.7, -1.0, 1.2, -1.9, -1.6, 1.5, -1.0, -2.6, -0.2, 0.2, 0.0, -2.7,
			-1.7, -1.5, 0.8, 0.8, -5.2, -5.2, 0.0, 0.4, 0.9, 2.7, -3.0, 1.7,
			3.6, -0.8, 0.4, -2.7, -2.8, 1.2, -2.0, -3.9, -0.5, 0.2, -0.1, -4.3,
			-2.7, -1.9, 1.8, 1.8, -5.2, -5.2, 0.5, -1.0, 0.4, 0.1, -2.0, -1.0,
			-0.8, 6.6, -1.4, -4.5, -4.4, -1.1, -3.5, -5.2, -1.6, 0.4, -1.1,
			-4.0, -4.0, -3.3, 0.25, 0.25, -5.2, -5.2, -0.8, 0.6, 1.2, 0.4,
			-1.3, 1.2, 0.4, -1.4, 6.0, -2.2, -1.9, 0.6, -1.3, -0.1, -1.1, -0.2,
			-0.3, -0.8, 2.2, -2.0, 0.8, 0.8, -5.2, -5.2, -0.8, -2.4, -2.8,
			-3.8, -1.1, -1.9, -2.7, -4.5, -2.2, 4.0, 2.8, -2.1, 2.5, 1.0, -2.6,
			-1.8, -0.6, -1.8, -0.7, 3.1, -3.3, -3.3, -5.2, -5.2, -1.2, -2.2,
			-3.0, -4.0, -1.5, -1.6, -2.8, -4.4, -1.9, 2.8, 4.0, -2.1, 2.8, 2.0,
			-2.3, -2.1, -1.3, -0.7, 0.0, 1.8, -3.5, -3.5, -5.2, -5.2, -0.4,
			2.7, 0.8, 0.5, -2.8, 1.5, 1.2, -1.1, 0.6, -2.1, -2.1, 3.2, -1.4,
			-3.3, -0.6, 0.1, 0.1, -3.5, -2.1, -1.7, 0.65, 0.65, -5.2, -5.2,
			-0.7, -1.7, -2.2, -3.0, -0.9, -1.0, -2.0, -3.5, -1.3, 2.5, 2.8,
			-1.4, 4.3, 1.6, -2.4, -1.4, -0.6, -1.0, -0.2, 1.6, -2.6, -2.6,
			-5.2, -5.2, -2.3, -3.2, -3.1, -4.5, -0.8, -2.6, -3.9, -5.2, -0.1,
			1.0, 2.0, -3.3, 1.6, 7.0, -3.8, -2.8, -2.2, 3.6, 5.1, 0.1, -3.8,
			-3.8, -5.2, -5.2, 0.3, -0.9, -0.9, -0.7, -3.1, -0.2, -0.5, -1.6,
			-1.1, -2.6, -2.3, -0.6, -2.4, -3.8, 7.6, 0.4, 0.1, -5.0, -3.1,
			-1.8, -0.8, -0.8, -5.2, -5.2, 1.1, -0.2, 0.9, 0.5, 0.1, 0.2, 0.2,
			0.4, -0.2, -1.8, -2.1, 0.1, -1.4, -2.8, 0.4, 2.2, 1.5, -3.3, -1.9,
			-1.0, 0.7, 0.7, -5.2, -5.2, 0.6, -0.2, 0.5, 0.0, -0.5, 0.0, -0.1,
			-1.1, -0.3, -0.6, -1.3, 0.1, -0.6, -2.2, 0.1, 1.5, 2.5, -3.5, -1.9,
			0.0, 0.25, 0.25, -5.2, -5.2, -3.6, -1.6, -3.6, -5.2, -1.0, -2.7,
			-4.3, -4.0, -0.8, -1.8, -0.7, -3.5, -1.0, 3.6, -5.0, -3.3, -3.5,
			14.2, 4.1, -2.6, -4.4, -4.4, -5.2, -5.2, -2.2, -1.8, -1.4, -2.8,
			-0.5, -1.7, -2.7, -4.0, 2.2, -0.7, 0.0, -2.1, -0.2, 5.1, -3.1,
			-1.9, -1.9, 4.1, 7.8, -1.1, -2.1, -2.1, -5.2, -5.2, 0.1, -2.0,
			-2.2, -2.9, 0.0, -1.5, -1.9, -3.3, -2.0, 3.1, 1.8, -1.7, 1.6, 0.1,
			-1.8, -1.0, 0.0, -2.6, -1.1, 3.4, -2.55, -2.55, -5.2, -5.2, -0.3,
			0, 3, 3.45, -2.5, 0.8, 1.8, 0.25, 0.8, -3.3, -3.5, 0.65, -2.6,
			-3.8, -0.8, 0.7, 0.25, -4.4, -2.1, -2.55, 4.25, 1.3, -5.2, -5.2,
			-0.3, 0, 3, 3.45, -2.5, 0.8, 1.8, 0.25, 0.8, -3.3, -3.5, 0.65,
			-2.6, -3.8, -0.8, 0.7, 0.25, -4.4, -2.1, -2.55, 1.3, 3.15, -5.2,
			-5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2,
			-5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2,
			-5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2,
			-5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2, -5.2,
			-5.2, -5.2, -5.2, -5.2, -5.2 };
	/**
	 * Pam250 matrix, normalized.
	 */
	static final double[] pam250 = { 2, -2, 0, 0, -2, 0, 0, 1, -1, -1, -2, -1,
			-1, -4, 1, 1, 1, -6, -3, 0, 0, 0, -8, -8, -2, 6, 0, -1, -4, 1, -1,
			-3, 2, -2, -3, 3, 0, -4, 0, 0, -1, 2, -4, -2, -0.5, -0.5, -8, -8,
			0, 0, 2, 2, -4, 1, 1, 0, 2, -2, -3, 1, -2, -4, -1, 1, 0, -4, -2,
			-2, 2, 2, -8, -8, 0, -1, 2, 4, -5, 2, 3, 1, 1, -2, -4, 0, -3, -6,
			-1, 0, 0, -7, -4, -2, 3, 3, -8, -8, -2, -4, -4, -5, 12, -5, -5, -3,
			-3, -2, -6, -5, -5, -4, -3, 0, -2, -8, 0, -2, -4.5, -4.5, -8, -8,
			0, 1, 1, 2, -5, 4, 2, -1, 3, -2, -2, 1, -1, -5, 0, -1, -1, -5, -4,
			-2, 1.5, 1.5, -8, -8, 0, -1, 1, 3, -5, 2, 4, 0, 1, -2, -3, 0, -2,
			-5, -1, 0, 0, -7, -4, -2, 2, 2, -8, -8, 1, -3, 0, 1, -3, -1, 0, 5,
			-2, -3, -4, -2, -3, -5, -1, 1, 0, -7, -5, -1, 0.5, 0.5, -8, -8, -1,
			2, 2, 1, -3, 3, 1, -2, 6, -2, -2, 0, -2, -2, 0, -1, -1, -3, 0, -2,
			1.5, 1.5, -8, -8, -1, -2, -2, -2, -2, -2, -2, -3, -2, 5, 2, -2, 2,
			1, -2, -1, 0, -5, -1, 4, -2, -2, -8, -8, -2, -3, -3, -4, -6, -2,
			-3, -4, -2, 2, 6, -3, 4, 2, -3, -3, -2, -2, -1, 2, -3.5, -3.5, -8,
			-8, -1, 3, 1, 0, -5, 1, 0, -2, 0, -2, -3, 5, 0, -5, -1, 0, 0, -3,
			-4, -2, 0.5, 0.5, -8, -8, -1, 0, -2, -3, -5, -1, -2, -3, -2, 2, 4,
			0, 6, 0, -2, -2, -1, -4, -2, 2, -2.5, -2.5, -8, -8, -4, -4, -4, -6,
			-4, -5, -5, -5, -2, 1, 2, -5, 0, 9, -5, -3, -3, 0, 7, -1, -5, -5,
			-8, -8, 1, 0, -1, -1, -3, 0, -1, -1, 0, -2, -3, -1, -2, -5, 6, 1,
			0, -6, -5, -1, -1, -1, -8, -8, 1, 0, 1, 0, 0, -1, 0, 1, -1, -1, -3,
			0, -2, -3, 1, 2, 1, -2, -3, -1, 0.5, 0.5, -8, -8, 1, -1, 0, 0, -2,
			-1, 0, 0, -1, 0, -2, 0, -1, -3, 0, 1, 3, -5, -3, 0, 0, 0, -8, -8,
			-6, 2, -4, -7, -8, -5, -7, -7, -3, -5, -2, -3, -4, 0, -6, -2, -5,
			17, 0, -6, -5.5, -5.5, -8, -8, -3, -4, -2, -4, 0, -4, -4, -5, 0,
			-1, -1, -4, -2, 7, -5, -3, -3, 0, 10, -2, -3, -3, -8, -8, 0, -2,
			-2, -2, -2, -2, -2, -1, -2, 4, 2, -2, 2, -1, -1, -1, 0, -6, -2, 4,
			-2, -2, -8, -8, 0, -0.5, 2, 3, -4.5, 1.5, 2, 0.5, 1.5, -2, -3.5,
			0.5, -2.5, -5, -1, 0.5, 0, -5.5, -3, -2, 3, 1.75, -8, -8, 0, -0.5,
			2, 3, -4.5, 1.5, 2, 0.5, 1.5, -2, -3.5, 0.5, -2.5, -5, -1, 0.5, 0,
			-5.5, -3, -2, 1.75, 4, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8,
			-8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8,
			-8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8,
			-8, -8, -8, -8, -8 };
	/**
	 * Pet91 matrix, normalized.
	 */
	static final double[] pet91 = { 1.00, 0.36, 0.45, 0.45, 0.36, 0.36, 0.36,
			0.55, 0.27, 0.45, 0.36, 0.36, 0.36, 0.18, 0.55, 0.55, 0.64, 0.09,
			0.18, 0.55, 0.45, 0.45, 0.00, 0.00, 0.36, 1.00, 0.45, 0.36, 0.36,
			0.64, 0.45, 0.45, 0.64, 0.18, 0.18, 0.82, 0.27, 0.09, 0.36, 0.36,
			0.36, 0.45, 0.27, 0.18, 0.405, 0.405, 0.00, 0.00, 0.45, 0.45, 1.00,
			0.64, 0.36, 0.45, 0.55, 0.45, 0.55, 0.27, 0.18, 0.55, 0.27, 0.18,
			0.36, 0.55, 0.55, 0.00, 0.36, 0.27, 0.82, 0.82, 0.00, 0.00, 0.45,
			0.36, 0.64, 1.00, 0.18, 0.55, 0.82, 0.55, 0.45, 0.18, 0.09, 0.45,
			0.18, 0.00, 0.27, 0.45, 0.36, 0.00, 0.27, 0.27, 0.82, 0.82, 0.00,
			0.00, 0.36, 0.36, 0.36, 0.18, 1.00, 0.18, 0.09, 0.36, 0.45, 0.27,
			0.18, 0.18, 0.27, 0.45, 0.27, 0.55, 0.36, 0.55, 0.64, 0.27, 0.27,
			0.27, 0.00, 0.00, 0.36, 0.64, 0.45, 0.55, 0.18, 1.00, 0.64, 0.36,
			0.64, 0.18, 0.27, 0.64, 0.27, 0.09, 0.45, 0.36, 0.36, 0.18, 0.27,
			0.18, 0.5, 0.5, 0.00, 0.00, 0.36, 0.45, 0.55, 0.82, 0.09, 0.64,
			1.00, 0.45, 0.45, 0.18, 0.09, 0.55, 0.18, 0.00, 0.27, 0.36, 0.36,
			0.00, 0.09, 0.27, 0.685, 0.685, 0.00, 0.00, 0.55, 0.45, 0.45, 0.55,
			0.36, 0.36, 0.45, 1.00, 0.27, 0.18, 0.09, 0.36, 0.18, 0.00, 0.36,
			0.55, 0.36, 0.27, 0.09, 0.27, 0.5, 0.5, 0.00, 0.00, 0.27, 0.64,
			0.55, 0.45, 0.45, 0.64, 0.45, 0.27, 1.00, 0.18, 0.27, 0.55, 0.27,
			0.45, 0.45, 0.36, 0.36, 0.18, 0.82, 0.18, 0.5, 0.5, 0.00, 0.00,
			0.45, 0.18, 0.27, 0.18, 0.27, 0.18, 0.18, 0.18, 0.18, 1.00, 0.64,
			0.18, 0.73, 0.45, 0.27, 0.36, 0.55, 0.09, 0.27, 0.82, 0.225, 0.225,
			0.00, 0.00, 0.36, 0.18, 0.18, 0.09, 0.18, 0.27, 0.09, 0.09, 0.27,
			0.64, 1.00, 0.18, 0.73, 0.64, 0.45, 0.27, 0.36, 0.27, 0.36, 0.64,
			0.135, 0.135, 0.00, 0.00, 0.36, 0.82, 0.55, 0.45, 0.18, 0.64, 0.55,
			0.36, 0.55, 0.18, 0.18, 1.00, 0.27, 0.00, 0.27, 0.36, 0.36, 0.18,
			0.18, 0.18, 0.5, 0.5, 0.00, 0.00, 0.36, 0.27, 0.27, 0.18, 0.27,
			0.27, 0.18, 0.18, 0.27, 0.73, 0.73, 0.27, 1.00, 0.45, 0.27, 0.36,
			0.45, 0.18, 0.27, 0.64, 0.225, 0.225, 0.00, 0.00, 0.18, 0.09, 0.18,
			0.00, 0.45, 0.09, 0.00, 0.00, 0.45, 0.45, 0.64, 0.00, 0.45, 1.00,
			0.18, 0.27, 0.27, 0.36, 0.91, 0.45, 0.09, 0.09, 0.00, 0.00, 0.55,
			0.36, 0.36, 0.27, 0.27, 0.45, 0.27, 0.36, 0.45, 0.27, 0.45, 0.27,
			0.27, 0.18, 1.00, 0.55, 0.55, 0.09, 0.18, 0.36, 0.315, 0.315, 0.00,
			0.00, 0.55, 0.36, 0.55, 0.45, 0.55, 0.36, 0.36, 0.55, 0.36, 0.36,
			0.27, 0.36, 0.36, 0.27, 0.55, 1.00, 0.55, 0.18, 0.36, 0.36, 0.5,
			0.5, 0.00, 0.00, 0.64, 0.36, 0.55, 0.36, 0.36, 0.36, 0.36, 0.36,
			0.36, 0.55, 0.36, 0.36, 0.45, 0.27, 0.55, 0.55, 1.00, 0.09, 0.18,
			0.45, 0.455, 0.455, 0.00, 0.00, 0.09, 0.45, 0.00, 0.00, 0.55, 0.18,
			0.00, 0.27, 0.18, 0.09, 0.27, 0.18, 0.18, 0.36, 0.09, 0.18, 0.09,
			1.00, 0.45, 0.18, 0, 0, 0.00, 0.00, 0.18, 0.27, 0.36, 0.27, 0.64,
			0.27, 0.09, 0.09, 0.82, 0.27, 0.36, 0.18, 0.27, 0.91, 0.18, 0.36,
			0.18, 0.45, 1.00, 0.18, 0.315, 0.315, 0.00, 0.00, 0.55, 0.18, 0.27,
			0.27, 0.27, 0.18, 0.27, 0.27, 0.18, 0.82, 0.64, 0.18, 0.64, 0.45,
			0.36, 0.36, 0.45, 0.18, 0.18, 1.00, 0.27, 0.27, 0.00, 0.00, 0.45,
			0.405, 0.82, 0.82, 0.27, 0.5, 0.685, 0.5, 0.5, 0.225, 0.135, 0.5,
			0.225, 0.09, 0.315, 0.5, 0.455, 0, 0.315, 0.27, 1, 0.5925, 0.00,
			0.00, 0.45, 0.405, 0.82, 0.82, 0.27, 0.5, 0.685, 0.5, 0.5, 0.225,
			0.135, 0.5, 0.225, 0.09, 0.315, 0.5, 0.455, 0, 0.315, 0.27, 0.5925,
			1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00,
			0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00,
			0.00, 0, 0, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00,
			0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00,
			0.00, 0.00, 0, 0, 0.00, 0.00 };
	/**
	 * Miyata and Armon matrix, normalized.
	 */
	static final double[] miyataArmon = { 0, 2.92, 1.78, 2.37, 1.39, 1.92,
			2.46, 0.91, 2.17, 2.69, 2.76, 2.96, 2.42, 3.23, 0.06, 0.51, 0.90,
			4.23, 3.18, 1.85, 2.075, 2.075, 6, 6, 2.92, 0, 2.04, 2.34, 3.06,
			1.13, 1.45, 3.58, 0.82, 2.49, 2.62, 0.40, 2.29, 2.47, 2.90, 2.74,
			2.03, 2.72, 2.02, 2.43, 2.19, 2.19, 6, 6, 1.78, 2.04, 0, 0.65,
			2.83, 0.99, 0.85, 1.96, 1.29, 3.37, 3.49, 1.84, 3.08, 3.70, 1.80,
			1.31, 1.40, 4.39, 3.42, 2.76, 0.325, 0.325, 6, 6, 2.37, 2.34, 0.65,
			0, 3.48, 1.47, 0.90, 2.37, 1.72, 3.98, 4.10, 2.05, 3.69, 4.27,
			2.40, 1.87, 2.05, 4.88, 3.95, 3.40, 0.325, 0.325, 6, 6, 1.39, 3.06,
			2.83, 3.48, 0, 2.48, 3.26, 2.22, 2.56, 1.63, 1.65, 3.27, 1.46,
			2.24, 1.33, 1.84, 1.45, 3.34, 2.38, 0.86, 3.155, 3.155, 6, 6, 1.92,
			1.13, 0.99, 1.47, 2.48, 0, 0.84, 2.48, 0.32, 2.57, 2.70, 1.06,
			2.30, 2.81, 1.92, 1.65, 1.12, 3.42, 2.48, 2.13, 1.23, 1.23, 6, 6,
			2.46, 1.45, 0.85, 0.90, 3.26, 0.84, 0, 2.78, 0.96, 3.39, 3.53,
			1.14, 3.13, 3.59, 2.48, 2.06, 1.83, 4.08, 3.22, 2.97, 0.875, 0.875,
			6, 6, 0.91, 3.58, 1.96, 2.37, 2.22, 2.48, 2.78, 0, 2.78, 3.60,
			3.67, 3.54, 3.34, 4.14, 0.97, 0.85, 1.70, 5.13, 4.08, 2.76, 2.165,
			2.165, 6, 6, 2.17, 0.82, 1.29, 1.72, 2.56, 0.32, 0.96, 2.78, 0,
			2.45, 2.59, 0.79, 2.19, 2.63, 2.15, 1.94, 1.32, 3.16, 2.27, 2.11,
			1.505, 1.505, 6, 6, 2.69, 2.49, 3.37, 3.98, 1.63, 2.57, 3.39, 3.60,
			2.45, 0, 0.14, 2.84, 0.29, 0.61, 2.62, 2.95, 2.14, 1.72, 0.86,
			0.85, 3.675, 3.675, 6, 6, 2.76, 2.62, 3.49, 4.10, 1.65, 2.70, 3.53,
			3.67, 2.59, 0.14, 0, 2.98, 0.41, 0.63, 2.70, 3.04, 2.25, 1.73,
			0.94, 0.91, 3.795, 3.795, 6, 6, 2.96, 0.40, 1.84, 2.05, 3.27, 1.06,
			1.14, 3.54, 0.79, 2.84, 2.98, 0, 2.63, 2.85, 2.94, 2.71, 2.10,
			3.11, 2.42, 2.70, 1.945, 1.945, 6, 6, 2.42, 2.29, 3.08, 3.69, 1.46,
			2.30, 3.13, 3.34, 2.19, 0.29, 0.41, 2.63, 0, 0.82, 2.36, 2.67,
			1.86, 1.89, 0.93, 0.62, 3.385, 3.385, 6, 6, 3.23, 2.47, 3.70, 4.27,
			2.24, 2.81, 3.59, 4.14, 2.63, 0.61, 0.63, 2.85, 0.82, 0, 3.17,
			3.45, 2.60, 1.11, 0.48, 1.43, 3.985, 3.985, 6, 6, 0.06, 2.90, 1.80,
			2.40, 1.33, 1.92, 2.48, 0.97, 2.15, 2.62, 2.70, 2.94, 2.36, 3.17,
			0, 0.56, 0.87, 4.17, 3.12, 1.79, 2.1, 2.1, 6, 6, 0.51, 2.74, 1.31,
			1.87, 1.84, 1.65, 2.06, 0.85, 1.94, 2.95, 3.04, 2.71, 2.67, 3.45,
			0.56, 0, 0.89, 4.38, 3.33, 2.15, 1.59, 1.59, 6, 6, 0.90, 2.03,
			1.40, 2.05, 1.45, 1.12, 1.83, 1.70, 1.32, 2.14, 2.25, 2.10, 1.86,
			2.60, 0.87, 0.89, 0, 3.50, 2.45, 1.42, 1.725, 1.725, 6, 6, 4.23,
			2.72, 4.39, 4.88, 3.34, 3.42, 4.08, 5.13, 3.16, 1.72, 1.73, 3.11,
			1.89, 1.11, 4.17, 4.38, 3.50, 0, 1.06, 2.51, 4.635, 4.635, 6, 6,
			3.18, 2.02, 3.42, 3.95, 2.38, 2.48, 3.22, 4.08, 2.27, 0.86, 0.94,
			2.42, 0.93, 0.48, 3.12, 3.33, 2.45, 1.06, 0, 1.52, 3.685, 3.685, 6,
			6, 1.85, 2.43, 2.76, 3.40, 0.86, 2.13, 2.97, 2.76, 2.11, 0.85,
			0.91, 2.70, 0.62, 1.43, 1.79, 2.15, 1.42, 2.51, 1.52, 0, 3.08,
			3.08, 6, 6, 2.075, 2.19, 0.325, 0.325, 3.155, 1.23, 0.875, 2.165,
			1.505, 3.675, 3.795, 1.945, 3.385, 3.985, 2.1, 1.59, 1.725, 4.635,
			3.685, 3.08, 0, 1.0525, 6, 6, 2.075, 2.19, 0.325, 0.325, 3.155,
			1.23, 0.875, 2.165, 1.505, 3.675, 3.795, 1.945, 3.385, 3.985, 2.1,
			1.59, 1.725, 4.635, 3.685, 3.08, 1.0525, 0, 6, 6, 6, 6, 6, 6, 6, 6,
			6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 0.5, 0.5, 6, 6, 6,
			6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 0.5, 0.5 };

	/**
	 * Given to characters that represent amino acids, finds indices of
	 * corresponding entry in 2D matrix.
	 * 
	 * @param a
	 * @param b
	 * @return indices
	 * 
	 *         This is too slow private static int[] pairIndex(char a, char b) {
	 * 
	 *         int hor = getIndex(a); int ver = getIndex(b); int[] pairIndeces =
	 *         new int[2]; pairIndeces[0] = hor; pairIndeces[1] = ver; return
	 *         pairIndeces; }
	 */

	/**
	 * Gets index 1st imdex of an amino acid in a 2D matix
	 * 
	 * @param a
	 * @return index
	 */
	final static int getIndex(final char a) {

		short idx = -1;
		switch (a) {
		case 'A':
			idx = 0;
			break;
		case 'R':
			idx = 1;
			break;
		case 'N':
			idx = 2;
			break;
		case 'D':
			idx = 3;
			break;
		case 'C':
			idx = 4;
			break;
		case 'Q':
			idx = 5;
			break;
		case 'E':
			idx = 6;
			break;
		case 'G':
			idx = 7;
			break;
		case 'H':
			idx = 8;
			break;
		case 'I':
			idx = 9;
			break;
		case 'L':
			idx = 10;
			break;
		case 'K':
			idx = 11;
			break;
		case 'M':
			idx = 12;
			break;
		case 'F':
			idx = 13;
			break;
		case 'P':
			idx = 14;
			break;
		case 'S':
			idx = 15;
			break;
		case 'T':
			idx = 16;
			break;
		case 'W':
			idx = 17;
			break;
		case 'Y':
			idx = 18;
			break;
		case 'V':
			idx = 19;
			break;
		case 'B':
			idx = 20;
			break;
		case 'Z':
			idx = 21;
			break;
		case 'X':
			idx = 22;
			break;
		case '-':
			idx = 23;
			break;
		default:
			throw new AssertionError("No such symbol in the matrix");
		}
		assert idx != -1;
		return idx;
	}

	/**
	 * Finds correspondig value in the matrix for the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return Blosum value
	 */
	static double BlosumPair(char a, char b) {
		return getPairIndex(blosum, a, b);
	}

	private final static double getPairIndex(final double[] matrix, char a,
			char b) {
		int idxa = getIndex(a);
		int idxb = idxa;
		if (a != b) {
			idxb = getIndex(b);
		}
		int pairIndex = 24 * idxa + idxb;
		return matrix[pairIndex];
	}

	private final static int getPairIndex(final int[] matrix, char a, char b) {
		int idxa = getIndex(a);
		int idxb = idxa;
		if (a != b) {
			idxb = getIndex(b);
		}
		int pairIndex = 24 * idxa + idxb;
		return matrix[pairIndex];
	}

	// Method not ready, needs to be fixed
	/**
	 * Finds correspondig value in the matrix for the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return Blosum value
	 */
	static int BlosumPair2(char a, char b) {
		return getPairIndex(blosum2, a, b);
	}

	/**
	 * Finds correspondig value in the matrix for the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return Gonnet value
	 */
	static double gonnetPair(char a, char b) {
		return getPairIndex(gonnet, a, b);
	}

	/**
	 * Finds correspondig value in the matrix for the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return pam250 value
	 */
	static double pam250Pair(char a, char b) {
		return getPairIndex(pam250, a, b);
	}

	/**
	 * Finds corresponding value in the matrix for the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return pet91 value
	 */
	static double pet91Pair(char a, char b) {
		return getPairIndex(pet91, a, b);
	}

	/**
	 * Finds correspondig value in the matrix for the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return MiyataArmon value
	 */
	static double miyataArmonPair(char a, char b) {
		return getPairIndex(miyataArmon, a, b);
	}

	/**
	 * Calculates dissimilarity of the two amino acids supplied.
	 * 
	 * @param a
	 * @param b
	 * @return dissimilarity
	 */
	static double dissimilarity(char a, char b) {
		double gpairA = gonnetPair(a, a);
		return (gpairA - gonnetPair(a, b)) / gpairA;
	}
}
