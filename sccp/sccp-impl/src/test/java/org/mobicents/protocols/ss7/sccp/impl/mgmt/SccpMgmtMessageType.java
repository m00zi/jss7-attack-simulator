/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 * 
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free 
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.protocols.ss7.sccp.impl.mgmt;

/**
 * @author baranowb
 * 
 */
public enum SccpMgmtMessageType {
	SSA(1), SSP(2), SST(3), SOR(4), SOG(5), SSC(6);
	SccpMgmtMessageType(int x) {
		this.t = x;
	}

	private int t;

	public int getType() {
		return t;
	}

	public static final SccpMgmtMessageType fromInt(int v) {
		switch (v) {
		case 1:
			return SSA;
		case 2:
			return SSP;
		case 3:
			return SST;
		case 4:
			return SOR;
		case 5:
			return SOG;
		case 6:
			return SSC;
		default:
			return null;

		}
	}
}
