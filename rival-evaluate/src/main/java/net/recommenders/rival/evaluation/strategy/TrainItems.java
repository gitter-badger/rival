package net.recommenders.rival.evaluation.strategy;

import java.util.Set;
import net.recommenders.rival.core.DataModel;

/**
 * An evaluation strategy where only the items in training are used as candidates.
 *
 * @author <a href="http://github.com/abellogin">Alejandro</a>
 */
public class TrainItems extends AbstractStrategy {

    public TrainItems(DataModel<Long, Long> training, DataModel<Long, Long> test, double threshold) {
        super(training, test, threshold);
    }

   @Override
    public Set<Long> getCandidateItemsToRank(Long user) {
        return getModelTrainingDifference(training, user);
    }
}
