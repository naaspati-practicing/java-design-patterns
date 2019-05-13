package com.iluwatar.adapter;


/**
*
* Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link RowingBoat}
* interface expected by the client ({@link Captain}).
*
*/
public class FishingBoatAdapter implements RowingBoat {
	private final FishingBoat boat = new FishingBoat();
	
	@Override
	public void row() {
		boat.sail();
	}

}
