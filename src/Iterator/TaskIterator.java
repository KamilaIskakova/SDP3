package Iterator;

import ChainofResponsibility.Task;

public interface TaskIterator {
    boolean hasNext();
    Task next();
}