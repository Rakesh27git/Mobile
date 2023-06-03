package spring_2_dto;

public class Menu {
	private String menuName;
	private String menuType;
	private Item item;

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", menuType=" + menuType + ", item=" + item + "]";
	}

}
