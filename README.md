# Abelian–Higgs Lab

Computational laboratory for the first phase of the Abelian–Higgs cosmic-string simulation path of the MSc thesis.

This repository is deliberately **not Kosmic**. It is the experimental environment used to investigate the physics, numerical methods, representations, benchmarks, and design decisions that will later inform the production C++ simulator.

## Research principle

> Explore → Measure → Decide → Implement → Validate

Every important numerical or architectural choice should, where practical, be supported by a small computational experiment before it is committed to Kosmic.

## Month 1 deliverable

**Simulation Notebook Laboratory v1**

The initial target is a coherent Kotlin/Jupyter notebook series covering:

1. Abelian–Higgs formulation
2. Field representation
3. Spatial discretization
4. Time evolution
5. Gauge invariance
6. Nielsen–Olesen vortices
7. Moving strings
8. String collisions
9. Small network experiments
10. Numerical and implementation benchmarks
11. Proposed Kosmic architecture

## Repository structure

- `notebooks/` — research notebooks, organized by question
- `src/` — reusable Kotlin implementation used by notebooks
- `benchmarks/` — numerical and computational benchmarks
- `experiments/` — experiment configurations and generated experiment metadata
- `data/` — small reference data and local generated data; large datasets stay external
- `results/` — figures, tables, and reports derived from experiments
- `docs/decisions/` — recorded methodological and architectural decisions
- `test/` — analytical, numerical, and physical tests

## Kosmic relationship

```text
abelian-higgs-lab
       │
       ├── experiments
       ├── benchmarks
       └── decisions
              │
              ▼
        Kosmic design
              │
              ▼
      production simulator
```

## Status

Month 1 / Simulation Path / Exploration phase.
