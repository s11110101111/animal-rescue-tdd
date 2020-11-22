package rescue.animals;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.Nullable;

import java.util.Objects;

@Table("ANIMALS")
class AnimalEntity {

	@Id
	private Integer id;

	private String name;

	private String avatarUrl;

	private Boolean pendingAdoption = false;

	public AnimalEntity(String name, String avatarUrl) {
		this.id = null;
		this.name = name;
		this.avatarUrl = avatarUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public Boolean getPendingAdoption() {
		return pendingAdoption;
	}

	public void setPendingAdoption(Boolean pendingAdoption) {
		this.pendingAdoption = pendingAdoption;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AnimalEntity that = (AnimalEntity) o;
		return Objects.equals(id, that.id) &&
			Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}