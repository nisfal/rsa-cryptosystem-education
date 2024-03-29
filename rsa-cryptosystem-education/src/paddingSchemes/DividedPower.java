/*
	Copyright (C) 2009, 2011 Jukka Tuominen

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package paddingSchemes;
import java.math.BigInteger;

/**
 * This is for power dividing
 * @author Jukka Tuominen
 */
public class DividedPower extends PowerOfTwo {

	/**
	 * Divides given number to fragments of power of two.
	 * 
	 * @param prime BigInteger
	 * @return StringBuilder containing divided power
	 */
	public StringBuilder powerDivison(BigInteger prime){
		StringBuilder pwr = new StringBuilder();
		BigInteger product, stop = BigInteger.ZERO;
		product = calculate(prime);
		stop = stop.add(prime);
		pwr.append(product);
		stop = stop.subtract(product);
		while (stop.compareTo(BigInteger.ZERO)>0){
			product = calculate(stop);
			stop = stop.subtract(product);
			pwr.insert(0, product+"+");
		}
		return pwr;
	}

}
