package interface_adapter;

public class RecipesState {
    private String recipeName = "";
    private String description = "";
    private String nutrients = "";
    private String ingredients = "";
    private String instructions = "";

    public RecipesState(RecipesState copy) {
        recipeName = copy.recipeName;
        description = copy.description;
        nutrients = copy.nutrients;
        instructions = copy.instructions;
    }

    public RecipesState() {}

    public String getRecipeName() {
        return recipeName;
    }

    public String getDescription() {
        return description;
    }

    public String getNutrients() {
        return nutrients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNutrients(String nutrients) {
        this.nutrients = nutrients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
