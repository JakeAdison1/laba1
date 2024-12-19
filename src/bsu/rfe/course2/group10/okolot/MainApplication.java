package bsu.rfe.course2.group10.okolot;

public class MainApplication {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        Eggs eggs = new Eggs("Яйца",3);

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else
            if (parts[0].equals("Eggs")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Eggs(parts[1],0);
            }

// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
                break;
        System.out.println("Всего хорошего!");

        int cheeseCount = countItems(breakfast, new Cheese());
        int appleCount = countItems(breakfast, new Apple(""));
        int eggsCount = countItems (breakfast, new Eggs("",0));

        System.out.println("Количество сыров: " + cheeseCount);
        System.out.println("Количество  яблок: " + appleCount);
        System.out.println("Количество яиц: " + eggsCount);
    }
    public static int countItems(Food[] breakfast, Food sample)
    {
        int count =0;
        for (Food foodItem : breakfast)
        {
            if (foodItem != null && foodItem.equals(sample))
            {
                count++;
            }
        }
        return count;
    }
    }
