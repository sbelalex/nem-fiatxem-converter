package io.nem.apps.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


/**
 * The Class FiatsXem.
 */
public class FiatsXem {
	
	/** The fiat xems. */
	private List<FiatXem> fiatXems = new ArrayList<FiatXem>();

	/**
	 * Gets the fiat xems.
	 *
	 * @return the fiat xems
	 */
	public List<FiatXem> getFiatXems() {
		return fiatXems;
	}

	/**
	 * Sets the fiat xems.
	 *
	 * @param fiatXems the new fiat xems
	 */
	public void setFiatXems(List<FiatXem> fiatXems) {
		this.fiatXems = fiatXems;
	}

	/**
	 * Adds the fiat xem.
	 *
	 * @param fx the fx
	 */
	public void addFiatXem(FiatXem fx) {
		this.fiatXems.add(fx);
	}
	
	/**
	 * Gets the xem price for.
	 *
	 * @param symbol the symbol
	 * @return the xem price for
	 */
	public BigDecimal getXemPriceFor(String symbol) {
		FiatXem price =  this.fiatXems.stream().filter(d -> symbol.equals(d.getParentSymbol())).findFirst().orElse(null);
		return price.getFiatPrices().get(0).getPrice();
	}
}
