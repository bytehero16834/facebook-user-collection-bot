```java
package com.madhub.facebookusercollecti;

/**
 * This utility class is designed to support the automation features of MadHub, specifically for managing Facebook user collections.
 * It addresses the challenges of efficiently gathering user data and interactions on the Facebook platform.
 * By utilizing these methods, users can enhance their account management workflows and improve engagement strategies.
 * This class is final and cannot be instantiated; all methods are static for easy access.
 */
public final class CollectionUtilityHelper {

    // Private constructor to prevent instantiation
    private CollectionUtilityHelper() {
        throw new UnsupportedOperationException("Cannot instantiate utility class.");
    }

    /**
     * This method addresses the problem of inefficient data collection from Facebook user profiles.
     * Users often struggle to gather relevant information about potential clients or followers.
     * This utility method allows filtering of users based on specific criteria to streamline the collection process.
     *
     * @param userIds         The list of user IDs to process.
     * @param filterCriteria  The criteria used to filter user profiles (e.g., country, gender).
     * @return A list of filtered user profiles based on the specified criteria.
     */
    public static List<UserProfile> collectUserProfiles(List<String> userIds, FilterCriteria filterCriteria) {
        // Validate input parameters
        if (userIds == null || userIds.isEmpty()) {
            throw new IllegalArgumentException("User IDs list cannot be null or empty.");
        }
        if (filterCriteria == null) {
            throw new IllegalArgumentException("Filter criteria cannot be null.");
        }

        // This represents the collection of user profiles
        List<UserProfile> collectedProfiles = new ArrayList<>();

        // Filtering logic here (pseudo-code)
        for (String userId : userIds) {
            UserProfile profile = fetchUserProfile(userId); // Mocked method to fetch user profile
            if (matchesCriteria(profile, filterCriteria)) {
                collectedProfiles.add(profile);
            }
        }

        return collectedProfiles; // Return the filtered list of user profiles
    }

    /**
     * This method helps users automate the process of sending friend requests to a list of filtered users.
     * This addresses the challenge of manual friend requests, which can be time-consuming and error-prone.
     *
     * @param userProfiles    The list of user profiles to whom friend requests will be sent.
     */
    public static void sendFriendRequests(List<UserProfile> userProfiles) {
        // Validate input
        if (userProfiles == null || userProfiles.isEmpty()) {
            throw new IllegalArgumentException("User profiles list cannot be null or empty.");
        }

        // Automation logic to send friend requests
        for (UserProfile profile : userProfiles) {
            if (!profile.isFriend()) { // Check if already friends
                sendFriendRequest(profile.getUserId()); // Mocked method to send friend request
            }
        }
    }

    /**
     * This method addresses the issue of manually tracking interactions with users.
     * It gathers interaction data with users from the collected profiles to enhance engagement strategies.
     *
     * @param userProfiles    The list of user profiles to analyze interactions.
     * @return A map containing user IDs and their respective interaction statistics.
     */
    public static Map<String, InteractionStats> analyzeUserInteractions(List<UserProfile> userProfiles) {
        // Validate input
        if (userProfiles == null || userProfiles.isEmpty()) {
            throw new IllegalArgumentException("User profiles list cannot be null or empty.");
        }

        Map<String, InteractionStats> interactionData = new HashMap<>();

        // Analyze interactions
        for (UserProfile profile : userProfiles) {
            InteractionStats stats = gatherInteractionStats(profile.getUserId()); // Mocked method
            interactionData.put(profile.getUserId(), stats);
        }

        return interactionData; // Return the mapped interaction data
    }

    // Mocked utility methods for demonstration (these would be implemented with actual data calls)
    private static UserProfile fetchUserProfile(String userId) {
        return new UserProfile(userId); // Placeholder implementation
    }

    private static boolean matchesCriteria(UserProfile profile, FilterCriteria criteria) {
        // Placeholder for filtering logic
        return true; // Assume all profiles match at this stage
    }

    private static void sendFriendRequest(String userId) {
        // Placeholder for sending friend request logic
    }

    private static InteractionStats gatherInteractionStats(String userId) {
        return new InteractionStats(); // Placeholder implementation
    }
}
```

### Code Explanation:
1. **Problem Identification**: The code begins by recognizing the challenges of managing Facebook user collections, including inefficient data gathering, manual friend requests, and tracking user interactions.
  
2. **Solution Implementation**: Each method is crafted to tackle specific issues:
   - `collectUserProfiles`: Automates the process of collecting and filtering user profiles based on specified criteria.
   - `sendFriendRequests`: Simplifies the sending of friend requests to filtered users, saving time and minimizing errors.
   - `analyzeUserInteractions`: Gathers interaction data with users, which is essential for effective engagement strategies.

3. **Result Demonstration**: The utility methods are designed to support MadHub's automation features, allowing users to manage their Facebook interactions efficiently and effectively.
