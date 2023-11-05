package com.prestosa.animal.midterm

import androidx.lifecycle.ViewModel

class AnimalRepos : ViewModel() {
    private val animalList = mutableListOf(
        AnimalAdapter.AnimalDataModel("Angel Fish", "Angel fish are small, brightly colored freshwater fish characterized by their round, disc-shaped bodies and flowing fins. They are popular in the aquarium trade and are known for their striking, eye-catching patterns."),
        AnimalAdapter.AnimalDataModel("Bull shark", "Bull sharks are powerful, aggressive sharks found in both saltwater and freshwater environments. They are known for their stout build, aggressive behavior, and the ability to tolerate a wide range of salinities, making them one of the few sharks that can swim in rivers."),
        AnimalAdapter.AnimalDataModel("Clown fish", "Clown fish are small, colorful marine fish known for their association with sea anemones. They have a symbiotic relationship with these stinging creatures, as they are protected by the anemones' tentacles and provide food in return."),
        AnimalAdapter.AnimalDataModel("Dolphin", "Dolphins are highly intelligent marine mammals with streamlined bodies, curved dorsal fins, and a reputation for their playful nature. They communicate through a complex system of clicks, whistles, and body language and are known for their acrobatic displays and strong social bonds within pods."),
        AnimalAdapter.AnimalDataModel("Electric eel", "Electric eels are not actually eels but a type of knifefish with the ability to generate electric shocks. They use this electricity for navigation, communication, and stunning prey, and are found in the waters of the Amazon and Orinoco river basins."),
        AnimalAdapter.AnimalDataModel("Flying fish", "Flying fish are a group of marine fish known for their remarkable ability to leap out of the water and glide through the air to escape from predators. They have specially adapted pectoral fins that act like wings, allowing them to \"fly\" for short distances."),
        AnimalAdapter.AnimalDataModel("Goby fish", "Goby fish are small, bottom-dwelling fish known for their vibrant colors and their habit of living in close association with burrowing invertebrates like shrimp and crabs. They often form mutualistic relationships with these creatures, offering protection in exchange for shelter."),
        AnimalAdapter.AnimalDataModel("Hammerhead shark", " Hammerhead sharks are distinctive for their flattened, T-shaped heads. These sharks are found in various oceans and are known for their acute sense of smell and the ability to detect prey hidden beneath the sand."),
        AnimalAdapter.AnimalDataModel("Icefish", "Icefish are a group of fish species found in the cold waters of the Southern Ocean around Antarctica. They lack hemoglobin, the protein responsible for oxygen transport in red blood cells, which makes their blood transparent and allows them to survive in extremely cold temperatures."),
        AnimalAdapter.AnimalDataModel("Jellyfish", "Jellyfish are gelatinous, marine invertebrates with umbrella-shaped bodies and stinging tentacles. They are known for their graceful, drifting movements and their ability to capture and immobilize prey using their venomous stingers."),
        AnimalAdapter.AnimalDataModel("Killer whale", "Killer whales, or orcas, are large marine mammals known for their striking black and white coloration. They are top predators in the ocean and exhibit complex social structures, diverse diets, and exceptional intelligence."),
        AnimalAdapter.AnimalDataModel("Lionfish", "Lionfish are colorful, venomous marine fish with striking spines and a distinctive appearance. They are native to the Indo-Pacific but have become invasive in the Atlantic Ocean and Caribbean, where they pose a threat to native ecosystems."),
        AnimalAdapter.AnimalDataModel("Moray eel", "Moray eels are elongated, snake-like fish with sharp teeth and a second set of jaws in their throats, allowing them to effectively capture and consume prey. They are often found in coral reefs and crevices along the ocean floor."),
        AnimalAdapter.AnimalDataModel("Nurse shark", "Nurse sharks are docile, bottom-dwelling sharks known for their slow-moving, sluggish behavior. They are typically harmless to humans and often rest on the ocean floor during the day, becoming more active at night."),
        AnimalAdapter.AnimalDataModel("Octopus", "Octopuses are highly intelligent cephalopods with soft, flexible bodies and eight long, suction-cup-covered arms. They are known for their problem-solving abilities, camouflage skills, and agility in capturing prey."),
        AnimalAdapter.AnimalDataModel("Puffer fish", "Puffer fish, also known as blowfish, can inflate their bodies into a spherical shape as a defense mechanism. Some species of puffer fish contain tetrodotoxin, a potent neurotoxin, which makes them a delicacy in some cuisines but potentially deadly if prepared improperly."),
        AnimalAdapter.AnimalDataModel("Queenfish", " Queenfish are fast-swimming fish with slender bodies and are popular among anglers for their sporting qualities. They are found in warm coastal waters and often travel in schools."),
        AnimalAdapter.AnimalDataModel("River dolphin", "River dolphins are a group of freshwater dolphins found in rivers and lakes in various parts of the world. They have adapted to life in freshwater environments and are known for their unique physical characteristics."),
        AnimalAdapter.AnimalDataModel("Sea horse", "Seahorses are small, upright-swimming fish with prehensile tails. They are named for their horse-like appearance and are known for their monogamous mating habits and unique method of reproduction."),
        AnimalAdapter.AnimalDataModel("Tiger shark", " Tiger sharks are large, powerful sharks with distinct dark stripes on their bodies. They are known for their voracious appetite and are often referred to as \"garbage cans of the sea\" due to their ability to eat a wide range of prey."),
        AnimalAdapter.AnimalDataModel("Urutuú snake", "The Urutuú snake is a venomous pit viper found in South America. It is known for its striking coloration and the potent venom it delivers through its fangs."),
        AnimalAdapter.AnimalDataModel("Vampire squid", "Vampire squid are deep-sea cephalopods known for their unique appearance. They are not true squids but have characteristics of both squid and octopuses. They inhabit the dark depths of the ocean and are well adapted to extreme pressure and low oxygen levels."),
        AnimalAdapter.AnimalDataModel("Walrus", "Walruses are large marine mammals with distinctive tusks and a blubbery body. They are known for their social behavior, tusk use in various activities, and being adapted to life in the Arctic."),
        AnimalAdapter.AnimalDataModel("X-ray fish", "X-ray fish, also known as glass catfish, have translucent bodies that allow you to see their internal organs. They are popular in aquariums and are known for their unique appearance."),
        AnimalAdapter.AnimalDataModel("Yellowfin tuna", "Yellowfin tuna are large, fast-swimming fish known for their yellow fins and high-quality, flavorful flesh. They are highly sought after in the fishing industry and are used in various culinary dishes."),
        AnimalAdapter.AnimalDataModel("Zebra fish", "Zebrafish are small, tropical freshwater fish with distinctive black and white stripes that resemble a zebra's pattern. They are often used in scientific research and genetic studies due to their transparency and rapid reproduction."),



    )

    fun getAnimalList(): List<AnimalAdapter.AnimalDataModel> {
        return animalList
    }
}
